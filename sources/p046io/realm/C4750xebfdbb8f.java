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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentPermissions;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentPermissionsRealmProxy */
public class C4750xebfdbb8f extends RentPermissions implements RealmObjectProxy, C4751xf0b2626a {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RentPermissionsColumnInfo columnInfo;
    private ProxyState<RentPermissions> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentPermissionsRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RentPermissions";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentPermissionsRealmProxy$RentPermissionsColumnInfo */
    static final class RentPermissionsColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long permissionKeyIndex;
        long permissionTitleIndex;
        long valueIndex;

        RentPermissionsColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.permissionKeyIndex = addColumnDetails("permissionKey", "permissionKey", objectSchemaInfo);
            this.permissionTitleIndex = addColumnDetails("permissionTitle", "permissionTitle", objectSchemaInfo);
            this.valueIndex = addColumnDetails("value", "value", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RentPermissionsColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new RentPermissionsColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            RentPermissionsColumnInfo rentPermissionsColumnInfo = (RentPermissionsColumnInfo) columnInfo;
            RentPermissionsColumnInfo rentPermissionsColumnInfo2 = (RentPermissionsColumnInfo) columnInfo2;
            rentPermissionsColumnInfo2.permissionKeyIndex = rentPermissionsColumnInfo.permissionKeyIndex;
            rentPermissionsColumnInfo2.permissionTitleIndex = rentPermissionsColumnInfo.permissionTitleIndex;
            rentPermissionsColumnInfo2.valueIndex = rentPermissionsColumnInfo.valueIndex;
            rentPermissionsColumnInfo2.maxColumnIndexValue = rentPermissionsColumnInfo.maxColumnIndexValue;
        }
    }

    C4750xebfdbb8f() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (RentPermissionsColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$permissionKey() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.permissionKeyIndex);
    }

    public void realmSet$permissionKey(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.permissionKeyIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.permissionKeyIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.permissionKeyIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.permissionKeyIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$permissionTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.permissionTitleIndex);
    }

    public void realmSet$permissionTitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.permissionTitleIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.permissionTitleIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.permissionTitleIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.permissionTitleIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public boolean realmGet$value() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.valueIndex);
    }

    public void realmSet$value(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.valueIndex, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.valueIndex, row$realm.getIndex(), z, true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("permissionKey", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("permissionTitle", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("value", RealmFieldType.BOOLEAN, false, false, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RentPermissionsColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new RentPermissionsColumnInfo(osSchemaInfo);
    }

    public static RentPermissions createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        RentPermissions rentPermissions = (RentPermissions) realm.createObjectInternal(RentPermissions.class, true, Collections.emptyList());
        C4751xf0b2626a ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface = rentPermissions;
        if (jSONObject.has("permissionKey")) {
            if (jSONObject.isNull("permissionKey")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmSet$permissionKey((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmSet$permissionKey(jSONObject.getString("permissionKey"));
            }
        }
        if (jSONObject.has("permissionTitle")) {
            if (jSONObject.isNull("permissionTitle")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmSet$permissionTitle((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmSet$permissionTitle(jSONObject.getString("permissionTitle"));
            }
        }
        if (jSONObject.has("value")) {
            if (!jSONObject.isNull("value")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmSet$value(jSONObject.getBoolean("value"));
            } else {
                throw new IllegalArgumentException("Trying to set non-nullable field 'value' to null.");
            }
        }
        return rentPermissions;
    }

    public static RentPermissions createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        RentPermissions rentPermissions = new RentPermissions();
        C4751xf0b2626a ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface = rentPermissions;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("permissionKey")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmSet$permissionKey(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmSet$permissionKey((String) null);
                }
            } else if (nextName.equals("permissionTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmSet$permissionTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmSet$permissionTitle((String) null);
                }
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmSet$value(jsonReader.nextBoolean());
            } else {
                jsonReader.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field 'value' to null.");
            }
        }
        jsonReader.endObject();
        return (RentPermissions) realm.copyToRealm(rentPermissions, new ImportFlag[0]);
    }

    private static C4750xebfdbb8f newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentPermissions.class), false, Collections.emptyList());
        C4750xebfdbb8f ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxy = new C4750xebfdbb8f();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxy;
    }

    public static RentPermissions copyOrUpdate(Realm realm, RentPermissionsColumnInfo rentPermissionsColumnInfo, RentPermissions rentPermissions, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (rentPermissions instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentPermissions;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return rentPermissions;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(rentPermissions);
        if (realmObjectProxy2 != null) {
            return (RentPermissions) realmObjectProxy2;
        }
        return copy(realm, rentPermissionsColumnInfo, rentPermissions, z, map, set);
    }

    public static RentPermissions copy(Realm realm, RentPermissionsColumnInfo rentPermissionsColumnInfo, RentPermissions rentPermissions, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(rentPermissions);
        if (realmObjectProxy != null) {
            return (RentPermissions) realmObjectProxy;
        }
        C4751xf0b2626a ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface = rentPermissions;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentPermissions.class), rentPermissionsColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(rentPermissionsColumnInfo.permissionKeyIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmGet$permissionKey());
        osObjectBuilder.addString(rentPermissionsColumnInfo.permissionTitleIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmGet$permissionTitle());
        osObjectBuilder.addBoolean(rentPermissionsColumnInfo.valueIndex, Boolean.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmGet$value()));
        C4750xebfdbb8f newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(rentPermissions, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, RentPermissions rentPermissions, Map<RealmModel, Long> map) {
        if (rentPermissions instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentPermissions;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(RentPermissions.class);
        long nativePtr = table.getNativePtr();
        RentPermissionsColumnInfo rentPermissionsColumnInfo = (RentPermissionsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentPermissions.class);
        long createRow = OsObject.createRow(table);
        map.put(rentPermissions, Long.valueOf(createRow));
        C4751xf0b2626a ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface = rentPermissions;
        String realmGet$permissionKey = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmGet$permissionKey();
        if (realmGet$permissionKey != null) {
            Table.nativeSetString(nativePtr, rentPermissionsColumnInfo.permissionKeyIndex, createRow, realmGet$permissionKey, false);
        }
        String realmGet$permissionTitle = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmGet$permissionTitle();
        if (realmGet$permissionTitle != null) {
            Table.nativeSetString(nativePtr, rentPermissionsColumnInfo.permissionTitleIndex, createRow, realmGet$permissionTitle, false);
        }
        Table.nativeSetBoolean(nativePtr, rentPermissionsColumnInfo.valueIndex, createRow, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmGet$value(), false);
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(RentPermissions.class);
        long nativePtr = table.getNativePtr();
        RentPermissionsColumnInfo rentPermissionsColumnInfo = (RentPermissionsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentPermissions.class);
        while (it.hasNext()) {
            RentPermissions rentPermissions = (RentPermissions) it.next();
            if (!map2.containsKey(rentPermissions)) {
                if (rentPermissions instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentPermissions;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentPermissions, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(rentPermissions, Long.valueOf(createRow));
                C4751xf0b2626a ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface = rentPermissions;
                String realmGet$permissionKey = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmGet$permissionKey();
                if (realmGet$permissionKey != null) {
                    Table.nativeSetString(nativePtr, rentPermissionsColumnInfo.permissionKeyIndex, createRow, realmGet$permissionKey, false);
                }
                String realmGet$permissionTitle = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmGet$permissionTitle();
                if (realmGet$permissionTitle != null) {
                    Table.nativeSetString(nativePtr, rentPermissionsColumnInfo.permissionTitleIndex, createRow, realmGet$permissionTitle, false);
                }
                Table.nativeSetBoolean(nativePtr, rentPermissionsColumnInfo.valueIndex, createRow, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmGet$value(), false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, RentPermissions rentPermissions, Map<RealmModel, Long> map) {
        if (rentPermissions instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentPermissions;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(RentPermissions.class);
        long nativePtr = table.getNativePtr();
        RentPermissionsColumnInfo rentPermissionsColumnInfo = (RentPermissionsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentPermissions.class);
        long createRow = OsObject.createRow(table);
        map.put(rentPermissions, Long.valueOf(createRow));
        C4751xf0b2626a ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface = rentPermissions;
        String realmGet$permissionKey = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmGet$permissionKey();
        if (realmGet$permissionKey != null) {
            Table.nativeSetString(nativePtr, rentPermissionsColumnInfo.permissionKeyIndex, createRow, realmGet$permissionKey, false);
        } else {
            Table.nativeSetNull(nativePtr, rentPermissionsColumnInfo.permissionKeyIndex, createRow, false);
        }
        String realmGet$permissionTitle = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmGet$permissionTitle();
        if (realmGet$permissionTitle != null) {
            Table.nativeSetString(nativePtr, rentPermissionsColumnInfo.permissionTitleIndex, createRow, realmGet$permissionTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, rentPermissionsColumnInfo.permissionTitleIndex, createRow, false);
        }
        Table.nativeSetBoolean(nativePtr, rentPermissionsColumnInfo.valueIndex, createRow, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmGet$value(), false);
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(RentPermissions.class);
        long nativePtr = table.getNativePtr();
        RentPermissionsColumnInfo rentPermissionsColumnInfo = (RentPermissionsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentPermissions.class);
        while (it.hasNext()) {
            RentPermissions rentPermissions = (RentPermissions) it.next();
            if (!map2.containsKey(rentPermissions)) {
                if (rentPermissions instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentPermissions;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentPermissions, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(rentPermissions, Long.valueOf(createRow));
                C4751xf0b2626a ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface = rentPermissions;
                String realmGet$permissionKey = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmGet$permissionKey();
                if (realmGet$permissionKey != null) {
                    Table.nativeSetString(nativePtr, rentPermissionsColumnInfo.permissionKeyIndex, createRow, realmGet$permissionKey, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentPermissionsColumnInfo.permissionKeyIndex, createRow, false);
                }
                String realmGet$permissionTitle = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmGet$permissionTitle();
                if (realmGet$permissionTitle != null) {
                    Table.nativeSetString(nativePtr, rentPermissionsColumnInfo.permissionTitleIndex, createRow, realmGet$permissionTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentPermissionsColumnInfo.permissionTitleIndex, createRow, false);
                }
                Table.nativeSetBoolean(nativePtr, rentPermissionsColumnInfo.valueIndex, createRow, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmGet$value(), false);
            }
        }
    }

    public static RentPermissions createDetachedCopy(RentPermissions rentPermissions, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        RentPermissions rentPermissions2;
        if (i > i2 || rentPermissions == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(rentPermissions);
        if (cacheData == null) {
            rentPermissions2 = new RentPermissions();
            map.put(rentPermissions, new RealmObjectProxy.CacheData(i, rentPermissions2));
        } else if (i >= cacheData.minDepth) {
            return (RentPermissions) cacheData.object;
        } else {
            cacheData.minDepth = i;
            rentPermissions2 = (RentPermissions) cacheData.object;
        }
        C4751xf0b2626a ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface = rentPermissions2;
        C4751xf0b2626a ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface2 = rentPermissions;
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmSet$permissionKey(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface2.realmGet$permissionKey());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmSet$permissionTitle(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface2.realmGet$permissionTitle());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface.realmSet$value(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxyinterface2.realmGet$value());
        return rentPermissions2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("RentPermissions = proxy[");
        sb.append("{permissionKey:");
        String str = "null";
        sb.append(realmGet$permissionKey() != null ? realmGet$permissionKey() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{permissionTitle:");
        if (realmGet$permissionTitle() != null) {
            str = realmGet$permissionTitle();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{value:");
        sb.append(realmGet$value());
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
        C4750xebfdbb8f ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxy = (C4750xebfdbb8f) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentpermissionsrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
