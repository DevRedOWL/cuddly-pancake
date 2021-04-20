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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.ManagePermissions;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_ManagePermissionsRealmProxy */
public class C4764xd43a5daf extends ManagePermissions implements RealmObjectProxy, C4765x8eba244a {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ManagePermissionsColumnInfo columnInfo;
    private ProxyState<ManagePermissions> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_ManagePermissionsRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ManagePermissions";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_ManagePermissionsRealmProxy$ManagePermissionsColumnInfo */
    static final class ManagePermissionsColumnInfo extends ColumnInfo {
        long canManageIndex;
        long maxColumnIndexValue;

        ManagePermissionsColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.canManageIndex = addColumnDetails("canManage", "canManage", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ManagePermissionsColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ManagePermissionsColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ManagePermissionsColumnInfo managePermissionsColumnInfo = (ManagePermissionsColumnInfo) columnInfo;
            ManagePermissionsColumnInfo managePermissionsColumnInfo2 = (ManagePermissionsColumnInfo) columnInfo2;
            managePermissionsColumnInfo2.canManageIndex = managePermissionsColumnInfo.canManageIndex;
            managePermissionsColumnInfo2.maxColumnIndexValue = managePermissionsColumnInfo.maxColumnIndexValue;
        }
    }

    C4764xd43a5daf() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ManagePermissionsColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public boolean realmGet$canManage() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.canManageIndex);
    }

    public void realmSet$canManage(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.canManageIndex, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.canManageIndex, row$realm.getIndex(), z, true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 1, 0);
        builder.addPersistedProperty("canManage", RealmFieldType.BOOLEAN, false, false, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ManagePermissionsColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ManagePermissionsColumnInfo(osSchemaInfo);
    }

    public static ManagePermissions createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ManagePermissions managePermissions = (ManagePermissions) realm.createObjectInternal(ManagePermissions.class, true, Collections.emptyList());
        C4765x8eba244a ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_managepermissionsrealmproxyinterface = managePermissions;
        if (jSONObject.has("canManage")) {
            if (!jSONObject.isNull("canManage")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_managepermissionsrealmproxyinterface.realmSet$canManage(jSONObject.getBoolean("canManage"));
            } else {
                throw new IllegalArgumentException("Trying to set non-nullable field 'canManage' to null.");
            }
        }
        return managePermissions;
    }

    public static ManagePermissions createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ManagePermissions managePermissions = new ManagePermissions();
        C4765x8eba244a ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_managepermissionsrealmproxyinterface = managePermissions;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals("canManage")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_managepermissionsrealmproxyinterface.realmSet$canManage(jsonReader.nextBoolean());
            } else {
                jsonReader.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field 'canManage' to null.");
            }
        }
        jsonReader.endObject();
        return (ManagePermissions) realm.copyToRealm(managePermissions, new ImportFlag[0]);
    }

    private static C4764xd43a5daf newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ManagePermissions.class), false, Collections.emptyList());
        C4764xd43a5daf ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_managepermissionsrealmproxy = new C4764xd43a5daf();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_managepermissionsrealmproxy;
    }

    public static ManagePermissions copyOrUpdate(Realm realm, ManagePermissionsColumnInfo managePermissionsColumnInfo, ManagePermissions managePermissions, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (managePermissions instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) managePermissions;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return managePermissions;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(managePermissions);
        if (realmObjectProxy2 != null) {
            return (ManagePermissions) realmObjectProxy2;
        }
        return copy(realm, managePermissionsColumnInfo, managePermissions, z, map, set);
    }

    public static ManagePermissions copy(Realm realm, ManagePermissionsColumnInfo managePermissionsColumnInfo, ManagePermissions managePermissions, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(managePermissions);
        if (realmObjectProxy != null) {
            return (ManagePermissions) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ManagePermissions.class), managePermissionsColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addBoolean(managePermissionsColumnInfo.canManageIndex, Boolean.valueOf(managePermissions.realmGet$canManage()));
        C4764xd43a5daf newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(managePermissions, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, ManagePermissions managePermissions, Map<RealmModel, Long> map) {
        if (managePermissions instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) managePermissions;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ManagePermissions.class);
        long nativePtr = table.getNativePtr();
        long createRow = OsObject.createRow(table);
        map.put(managePermissions, Long.valueOf(createRow));
        Table.nativeSetBoolean(nativePtr, ((ManagePermissionsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ManagePermissions.class)).canManageIndex, createRow, managePermissions.realmGet$canManage(), false);
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(ManagePermissions.class);
        long nativePtr = table.getNativePtr();
        ManagePermissionsColumnInfo managePermissionsColumnInfo = (ManagePermissionsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ManagePermissions.class);
        while (it.hasNext()) {
            ManagePermissions managePermissions = (ManagePermissions) it.next();
            if (!map.containsKey(managePermissions)) {
                if (managePermissions instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) managePermissions;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(managePermissions, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(managePermissions, Long.valueOf(createRow));
                Table.nativeSetBoolean(nativePtr, managePermissionsColumnInfo.canManageIndex, createRow, managePermissions.realmGet$canManage(), false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ManagePermissions managePermissions, Map<RealmModel, Long> map) {
        if (managePermissions instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) managePermissions;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ManagePermissions.class);
        long nativePtr = table.getNativePtr();
        long createRow = OsObject.createRow(table);
        map.put(managePermissions, Long.valueOf(createRow));
        Table.nativeSetBoolean(nativePtr, ((ManagePermissionsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ManagePermissions.class)).canManageIndex, createRow, managePermissions.realmGet$canManage(), false);
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(ManagePermissions.class);
        long nativePtr = table.getNativePtr();
        ManagePermissionsColumnInfo managePermissionsColumnInfo = (ManagePermissionsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ManagePermissions.class);
        while (it.hasNext()) {
            ManagePermissions managePermissions = (ManagePermissions) it.next();
            if (!map.containsKey(managePermissions)) {
                if (managePermissions instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) managePermissions;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(managePermissions, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(managePermissions, Long.valueOf(createRow));
                Table.nativeSetBoolean(nativePtr, managePermissionsColumnInfo.canManageIndex, createRow, managePermissions.realmGet$canManage(), false);
            }
        }
    }

    public static ManagePermissions createDetachedCopy(ManagePermissions managePermissions, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ManagePermissions managePermissions2;
        if (i > i2 || managePermissions == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(managePermissions);
        if (cacheData == null) {
            managePermissions2 = new ManagePermissions();
            map.put(managePermissions, new RealmObjectProxy.CacheData(i, managePermissions2));
        } else if (i >= cacheData.minDepth) {
            return (ManagePermissions) cacheData.object;
        } else {
            cacheData.minDepth = i;
            managePermissions2 = (ManagePermissions) cacheData.object;
        }
        managePermissions2.realmSet$canManage(managePermissions.realmGet$canManage());
        return managePermissions2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "ManagePermissions = proxy[" + "{canManage:" + realmGet$canManage() + "}" + "]";
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
        C4764xd43a5daf ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_managepermissionsrealmproxy = (C4764xd43a5daf) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_managepermissionsrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_managepermissionsrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_managepermissionsrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
