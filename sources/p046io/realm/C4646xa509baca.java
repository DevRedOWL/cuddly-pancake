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
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.ManagementType;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_ManagementTypeRealmProxy */
public class C4646xa509baca extends ManagementType implements RealmObjectProxy, C4647xa8a2558f {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ManagementTypeColumnInfo columnInfo;
    private ProxyState<ManagementType> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_ManagementTypeRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ManagementType";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_ManagementTypeRealmProxy$ManagementTypeColumnInfo */
    static final class ManagementTypeColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long rulesIndex;
        long titleIndex;
        long typeIndex;

        ManagementTypeColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.typeIndex = addColumnDetails("type", "type", objectSchemaInfo);
            this.rulesIndex = addColumnDetails("rules", "rules", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ManagementTypeColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ManagementTypeColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ManagementTypeColumnInfo managementTypeColumnInfo = (ManagementTypeColumnInfo) columnInfo;
            ManagementTypeColumnInfo managementTypeColumnInfo2 = (ManagementTypeColumnInfo) columnInfo2;
            managementTypeColumnInfo2.typeIndex = managementTypeColumnInfo.typeIndex;
            managementTypeColumnInfo2.rulesIndex = managementTypeColumnInfo.rulesIndex;
            managementTypeColumnInfo2.titleIndex = managementTypeColumnInfo.titleIndex;
            managementTypeColumnInfo2.maxColumnIndexValue = managementTypeColumnInfo.maxColumnIndexValue;
        }
    }

    C4646xa509baca() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ManagementTypeColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$type() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.typeIndex);
    }

    public void realmSet$type(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.typeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.typeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.typeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.typeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$rules() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.rulesIndex);
    }

    public void realmSet$rules(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.rulesIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.rulesIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.rulesIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.rulesIndex, row$realm.getIndex(), str, true);
            }
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("type", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("rules", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ManagementTypeColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ManagementTypeColumnInfo(osSchemaInfo);
    }

    public static ManagementType createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ManagementType managementType = (ManagementType) realm.createObjectInternal(ManagementType.class, true, Collections.emptyList());
        C4647xa8a2558f ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface = managementType;
        if (jSONObject.has("type")) {
            if (jSONObject.isNull("type")) {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmSet$type((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmSet$type(jSONObject.getString("type"));
            }
        }
        if (jSONObject.has("rules")) {
            if (jSONObject.isNull("rules")) {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmSet$rules((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmSet$rules(jSONObject.getString("rules"));
            }
        }
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        return managementType;
    }

    public static ManagementType createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ManagementType managementType = new ManagementType();
        C4647xa8a2558f ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface = managementType;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("type")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmSet$type(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmSet$type((String) null);
                }
            } else if (nextName.equals("rules")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmSet$rules(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmSet$rules((String) null);
                }
            } else if (!nextName.equals("title")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmSet$title(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmSet$title((String) null);
            }
        }
        jsonReader.endObject();
        return (ManagementType) realm.copyToRealm(managementType, new ImportFlag[0]);
    }

    private static C4646xa509baca newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ManagementType.class), false, Collections.emptyList());
        C4646xa509baca ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxy = new C4646xa509baca();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxy;
    }

    public static ManagementType copyOrUpdate(Realm realm, ManagementTypeColumnInfo managementTypeColumnInfo, ManagementType managementType, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (managementType instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) managementType;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return managementType;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(managementType);
        if (realmObjectProxy2 != null) {
            return (ManagementType) realmObjectProxy2;
        }
        return copy(realm, managementTypeColumnInfo, managementType, z, map, set);
    }

    public static ManagementType copy(Realm realm, ManagementTypeColumnInfo managementTypeColumnInfo, ManagementType managementType, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(managementType);
        if (realmObjectProxy != null) {
            return (ManagementType) realmObjectProxy;
        }
        C4647xa8a2558f ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface = managementType;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ManagementType.class), managementTypeColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(managementTypeColumnInfo.typeIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmGet$type());
        osObjectBuilder.addString(managementTypeColumnInfo.rulesIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmGet$rules());
        osObjectBuilder.addString(managementTypeColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmGet$title());
        C4646xa509baca newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(managementType, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, ManagementType managementType, Map<RealmModel, Long> map) {
        if (managementType instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) managementType;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ManagementType.class);
        long nativePtr = table.getNativePtr();
        ManagementTypeColumnInfo managementTypeColumnInfo = (ManagementTypeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ManagementType.class);
        long createRow = OsObject.createRow(table);
        map.put(managementType, Long.valueOf(createRow));
        C4647xa8a2558f ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface = managementType;
        String realmGet$type = ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, managementTypeColumnInfo.typeIndex, createRow, realmGet$type, false);
        }
        String realmGet$rules = ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmGet$rules();
        if (realmGet$rules != null) {
            Table.nativeSetString(nativePtr, managementTypeColumnInfo.rulesIndex, createRow, realmGet$rules, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, managementTypeColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ManagementType.class);
        long nativePtr = table.getNativePtr();
        ManagementTypeColumnInfo managementTypeColumnInfo = (ManagementTypeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ManagementType.class);
        while (it.hasNext()) {
            ManagementType managementType = (ManagementType) it.next();
            if (!map2.containsKey(managementType)) {
                if (managementType instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) managementType;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(managementType, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(managementType, Long.valueOf(createRow));
                C4647xa8a2558f ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface = managementType;
                String realmGet$type = ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, managementTypeColumnInfo.typeIndex, createRow, realmGet$type, false);
                }
                String realmGet$rules = ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmGet$rules();
                if (realmGet$rules != null) {
                    Table.nativeSetString(nativePtr, managementTypeColumnInfo.rulesIndex, createRow, realmGet$rules, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, managementTypeColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ManagementType managementType, Map<RealmModel, Long> map) {
        if (managementType instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) managementType;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ManagementType.class);
        long nativePtr = table.getNativePtr();
        ManagementTypeColumnInfo managementTypeColumnInfo = (ManagementTypeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ManagementType.class);
        long createRow = OsObject.createRow(table);
        map.put(managementType, Long.valueOf(createRow));
        C4647xa8a2558f ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface = managementType;
        String realmGet$type = ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, managementTypeColumnInfo.typeIndex, createRow, realmGet$type, false);
        } else {
            Table.nativeSetNull(nativePtr, managementTypeColumnInfo.typeIndex, createRow, false);
        }
        String realmGet$rules = ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmGet$rules();
        if (realmGet$rules != null) {
            Table.nativeSetString(nativePtr, managementTypeColumnInfo.rulesIndex, createRow, realmGet$rules, false);
        } else {
            Table.nativeSetNull(nativePtr, managementTypeColumnInfo.rulesIndex, createRow, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, managementTypeColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, managementTypeColumnInfo.titleIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ManagementType.class);
        long nativePtr = table.getNativePtr();
        ManagementTypeColumnInfo managementTypeColumnInfo = (ManagementTypeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ManagementType.class);
        while (it.hasNext()) {
            ManagementType managementType = (ManagementType) it.next();
            if (!map2.containsKey(managementType)) {
                if (managementType instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) managementType;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(managementType, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(managementType, Long.valueOf(createRow));
                C4647xa8a2558f ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface = managementType;
                String realmGet$type = ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, managementTypeColumnInfo.typeIndex, createRow, realmGet$type, false);
                } else {
                    Table.nativeSetNull(nativePtr, managementTypeColumnInfo.typeIndex, createRow, false);
                }
                String realmGet$rules = ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmGet$rules();
                if (realmGet$rules != null) {
                    Table.nativeSetString(nativePtr, managementTypeColumnInfo.rulesIndex, createRow, realmGet$rules, false);
                } else {
                    Table.nativeSetNull(nativePtr, managementTypeColumnInfo.rulesIndex, createRow, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, managementTypeColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, managementTypeColumnInfo.titleIndex, createRow, false);
                }
            }
        }
    }

    public static ManagementType createDetachedCopy(ManagementType managementType, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ManagementType managementType2;
        if (i > i2 || managementType == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(managementType);
        if (cacheData == null) {
            managementType2 = new ManagementType();
            map.put(managementType, new RealmObjectProxy.CacheData(i, managementType2));
        } else if (i >= cacheData.minDepth) {
            return (ManagementType) cacheData.object;
        } else {
            cacheData.minDepth = i;
            managementType2 = (ManagementType) cacheData.object;
        }
        C4647xa8a2558f ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface = managementType2;
        C4647xa8a2558f ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface2 = managementType;
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmSet$type(ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface2.realmGet$type());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmSet$rules(ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface2.realmGet$rules());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxyinterface2.realmGet$title());
        return managementType2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ManagementType = proxy[");
        sb.append("{type:");
        String str = "null";
        sb.append(realmGet$type() != null ? realmGet$type() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{rules:");
        sb.append(realmGet$rules() != null ? realmGet$rules() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        if (realmGet$title() != null) {
            str = realmGet$title();
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
        C4646xa509baca ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxy = (C4646xa509baca) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_entity_hardware_managementtyperealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
