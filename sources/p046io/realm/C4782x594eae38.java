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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserCompany;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserCompanyRealmProxy */
public class C4782x594eae38 extends UserCompany implements RealmObjectProxy, C4783x2ecd5de1 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private UserCompanyColumnInfo columnInfo;
    private ProxyState<UserCompany> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserCompanyRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "UserCompany";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserCompanyRealmProxy$UserCompanyColumnInfo */
    static final class UserCompanyColumnInfo extends ColumnInfo {
        long isDirectorIndex;
        long maxColumnIndexValue;
        long titleIndex;

        UserCompanyColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.isDirectorIndex = addColumnDetails("isDirector", "isDirector", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        UserCompanyColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new UserCompanyColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            UserCompanyColumnInfo userCompanyColumnInfo = (UserCompanyColumnInfo) columnInfo;
            UserCompanyColumnInfo userCompanyColumnInfo2 = (UserCompanyColumnInfo) columnInfo2;
            userCompanyColumnInfo2.titleIndex = userCompanyColumnInfo.titleIndex;
            userCompanyColumnInfo2.isDirectorIndex = userCompanyColumnInfo.isDirectorIndex;
            userCompanyColumnInfo2.maxColumnIndexValue = userCompanyColumnInfo.maxColumnIndexValue;
        }
    }

    C4782x594eae38() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (UserCompanyColumnInfo) realmObjectContext.getColumnInfo();
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

    public Boolean realmGet$isDirector() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.isDirectorIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.isDirectorIndex));
    }

    public void realmSet$isDirector(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.isDirectorIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.isDirectorIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.isDirectorIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.isDirectorIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("isDirector", RealmFieldType.BOOLEAN, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UserCompanyColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new UserCompanyColumnInfo(osSchemaInfo);
    }

    public static UserCompany createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        UserCompany userCompany = (UserCompany) realm.createObjectInternal(UserCompany.class, true, Collections.emptyList());
        C4783x2ecd5de1 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface = userCompany;
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has("isDirector")) {
            if (jSONObject.isNull("isDirector")) {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface.realmSet$isDirector((Boolean) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface.realmSet$isDirector(Boolean.valueOf(jSONObject.getBoolean("isDirector")));
            }
        }
        return userCompany;
    }

    public static UserCompany createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        UserCompany userCompany = new UserCompany();
        C4783x2ecd5de1 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface = userCompany;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (!nextName.equals("isDirector")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface.realmSet$isDirector(Boolean.valueOf(jsonReader.nextBoolean()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface.realmSet$isDirector((Boolean) null);
            }
        }
        jsonReader.endObject();
        return (UserCompany) realm.copyToRealm(userCompany, new ImportFlag[0]);
    }

    private static C4782x594eae38 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserCompany.class), false, Collections.emptyList());
        C4782x594eae38 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxy = new C4782x594eae38();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxy;
    }

    public static UserCompany copyOrUpdate(Realm realm, UserCompanyColumnInfo userCompanyColumnInfo, UserCompany userCompany, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (userCompany instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) userCompany;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return userCompany;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(userCompany);
        if (realmObjectProxy2 != null) {
            return (UserCompany) realmObjectProxy2;
        }
        return copy(realm, userCompanyColumnInfo, userCompany, z, map, set);
    }

    public static UserCompany copy(Realm realm, UserCompanyColumnInfo userCompanyColumnInfo, UserCompany userCompany, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(userCompany);
        if (realmObjectProxy != null) {
            return (UserCompany) realmObjectProxy;
        }
        C4783x2ecd5de1 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface = userCompany;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(UserCompany.class), userCompanyColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(userCompanyColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface.realmGet$title());
        osObjectBuilder.addBoolean(userCompanyColumnInfo.isDirectorIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface.realmGet$isDirector());
        C4782x594eae38 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(userCompany, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, UserCompany userCompany, Map<RealmModel, Long> map) {
        if (userCompany instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) userCompany;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(UserCompany.class);
        long nativePtr = table.getNativePtr();
        UserCompanyColumnInfo userCompanyColumnInfo = (UserCompanyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserCompany.class);
        long createRow = OsObject.createRow(table);
        map.put(userCompany, Long.valueOf(createRow));
        C4783x2ecd5de1 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface = userCompany;
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, userCompanyColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        Boolean realmGet$isDirector = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface.realmGet$isDirector();
        if (realmGet$isDirector != null) {
            Table.nativeSetBoolean(nativePtr, userCompanyColumnInfo.isDirectorIndex, createRow, realmGet$isDirector.booleanValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(UserCompany.class);
        long nativePtr = table.getNativePtr();
        UserCompanyColumnInfo userCompanyColumnInfo = (UserCompanyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserCompany.class);
        while (it.hasNext()) {
            UserCompany userCompany = (UserCompany) it.next();
            if (!map2.containsKey(userCompany)) {
                if (userCompany instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) userCompany;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(userCompany, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(userCompany, Long.valueOf(createRow));
                C4783x2ecd5de1 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface = userCompany;
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, userCompanyColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
                Boolean realmGet$isDirector = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface.realmGet$isDirector();
                if (realmGet$isDirector != null) {
                    Table.nativeSetBoolean(nativePtr, userCompanyColumnInfo.isDirectorIndex, createRow, realmGet$isDirector.booleanValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, UserCompany userCompany, Map<RealmModel, Long> map) {
        if (userCompany instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) userCompany;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(UserCompany.class);
        long nativePtr = table.getNativePtr();
        UserCompanyColumnInfo userCompanyColumnInfo = (UserCompanyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserCompany.class);
        long createRow = OsObject.createRow(table);
        map.put(userCompany, Long.valueOf(createRow));
        C4783x2ecd5de1 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface = userCompany;
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, userCompanyColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, userCompanyColumnInfo.titleIndex, createRow, false);
        }
        Boolean realmGet$isDirector = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface.realmGet$isDirector();
        if (realmGet$isDirector != null) {
            Table.nativeSetBoolean(nativePtr, userCompanyColumnInfo.isDirectorIndex, createRow, realmGet$isDirector.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, userCompanyColumnInfo.isDirectorIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(UserCompany.class);
        long nativePtr = table.getNativePtr();
        UserCompanyColumnInfo userCompanyColumnInfo = (UserCompanyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserCompany.class);
        while (it.hasNext()) {
            UserCompany userCompany = (UserCompany) it.next();
            if (!map2.containsKey(userCompany)) {
                if (userCompany instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) userCompany;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(userCompany, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(userCompany, Long.valueOf(createRow));
                C4783x2ecd5de1 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface = userCompany;
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, userCompanyColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, userCompanyColumnInfo.titleIndex, createRow, false);
                }
                Boolean realmGet$isDirector = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface.realmGet$isDirector();
                if (realmGet$isDirector != null) {
                    Table.nativeSetBoolean(nativePtr, userCompanyColumnInfo.isDirectorIndex, createRow, realmGet$isDirector.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, userCompanyColumnInfo.isDirectorIndex, createRow, false);
                }
            }
        }
    }

    public static UserCompany createDetachedCopy(UserCompany userCompany, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        UserCompany userCompany2;
        if (i > i2 || userCompany == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(userCompany);
        if (cacheData == null) {
            userCompany2 = new UserCompany();
            map.put(userCompany, new RealmObjectProxy.CacheData(i, userCompany2));
        } else if (i >= cacheData.minDepth) {
            return (UserCompany) cacheData.object;
        } else {
            cacheData.minDepth = i;
            userCompany2 = (UserCompany) cacheData.object;
        }
        C4783x2ecd5de1 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface = userCompany2;
        C4783x2ecd5de1 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface2 = userCompany;
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface.realmSet$isDirector(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxyinterface2.realmGet$isDirector());
        return userCompany2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("UserCompany = proxy[");
        sb.append("{title:");
        Object obj = "null";
        sb.append(realmGet$title() != null ? realmGet$title() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{isDirector:");
        Object obj2 = obj;
        if (realmGet$isDirector() != null) {
            obj2 = realmGet$isDirector();
        }
        sb.append(obj2);
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
        C4782x594eae38 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxy = (C4782x594eae38) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_usercompanyrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
