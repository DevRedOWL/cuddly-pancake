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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.TypeRent;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_TypeRentRealmProxy */
public class C4762x65e9722d extends TypeRent implements RealmObjectProxy, C4763x6ae73d8c {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TypeRentColumnInfo columnInfo;
    private ProxyState<TypeRent> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_TypeRentRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TypeRent";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_TypeRentRealmProxy$TypeRentColumnInfo */
    static final class TypeRentColumnInfo extends ColumnInfo {
        long displayNameIndex;
        long maxColumnIndexValue;
        long nameIndex;

        TypeRentColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.displayNameIndex = addColumnDetails("displayName", "displayName", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TypeRentColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TypeRentColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TypeRentColumnInfo typeRentColumnInfo = (TypeRentColumnInfo) columnInfo;
            TypeRentColumnInfo typeRentColumnInfo2 = (TypeRentColumnInfo) columnInfo2;
            typeRentColumnInfo2.nameIndex = typeRentColumnInfo.nameIndex;
            typeRentColumnInfo2.displayNameIndex = typeRentColumnInfo.displayNameIndex;
            typeRentColumnInfo2.maxColumnIndexValue = typeRentColumnInfo.maxColumnIndexValue;
        }
    }

    C4762x65e9722d() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TypeRentColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$name() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.nameIndex);
    }

    public void realmSet$name(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.nameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.nameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.nameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.nameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$displayName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.displayNameIndex);
    }

    public void realmSet$displayName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.displayNameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.displayNameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.displayNameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.displayNameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("displayName", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TypeRentColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TypeRentColumnInfo(osSchemaInfo);
    }

    public static TypeRent createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        TypeRent typeRent = (TypeRent) realm.createObjectInternal(TypeRent.class, true, Collections.emptyList());
        C4763x6ae73d8c ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface = typeRent;
        if (jSONObject.has("name")) {
            if (jSONObject.isNull("name")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface.realmSet$name((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface.realmSet$name(jSONObject.getString("name"));
            }
        }
        if (jSONObject.has("displayName")) {
            if (jSONObject.isNull("displayName")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface.realmSet$displayName((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface.realmSet$displayName(jSONObject.getString("displayName"));
            }
        }
        return typeRent;
    }

    public static TypeRent createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        TypeRent typeRent = new TypeRent();
        C4763x6ae73d8c ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface = typeRent;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface.realmSet$name((String) null);
                }
            } else if (!nextName.equals("displayName")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface.realmSet$displayName(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface.realmSet$displayName((String) null);
            }
        }
        jsonReader.endObject();
        return (TypeRent) realm.copyToRealm(typeRent, new ImportFlag[0]);
    }

    private static C4762x65e9722d newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) TypeRent.class), false, Collections.emptyList());
        C4762x65e9722d ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxy = new C4762x65e9722d();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxy;
    }

    public static TypeRent copyOrUpdate(Realm realm, TypeRentColumnInfo typeRentColumnInfo, TypeRent typeRent, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (typeRent instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) typeRent;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return typeRent;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(typeRent);
        if (realmObjectProxy2 != null) {
            return (TypeRent) realmObjectProxy2;
        }
        return copy(realm, typeRentColumnInfo, typeRent, z, map, set);
    }

    public static TypeRent copy(Realm realm, TypeRentColumnInfo typeRentColumnInfo, TypeRent typeRent, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(typeRent);
        if (realmObjectProxy != null) {
            return (TypeRent) realmObjectProxy;
        }
        C4763x6ae73d8c ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface = typeRent;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TypeRent.class), typeRentColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(typeRentColumnInfo.nameIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(typeRentColumnInfo.displayNameIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface.realmGet$displayName());
        C4762x65e9722d newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(typeRent, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, TypeRent typeRent, Map<RealmModel, Long> map) {
        if (typeRent instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) typeRent;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TypeRent.class);
        long nativePtr = table.getNativePtr();
        TypeRentColumnInfo typeRentColumnInfo = (TypeRentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TypeRent.class);
        long createRow = OsObject.createRow(table);
        map.put(typeRent, Long.valueOf(createRow));
        C4763x6ae73d8c ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface = typeRent;
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, typeRentColumnInfo.nameIndex, createRow, realmGet$name, false);
        }
        String realmGet$displayName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface.realmGet$displayName();
        if (realmGet$displayName != null) {
            Table.nativeSetString(nativePtr, typeRentColumnInfo.displayNameIndex, createRow, realmGet$displayName, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(TypeRent.class);
        long nativePtr = table.getNativePtr();
        TypeRentColumnInfo typeRentColumnInfo = (TypeRentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TypeRent.class);
        while (it.hasNext()) {
            TypeRent typeRent = (TypeRent) it.next();
            if (!map2.containsKey(typeRent)) {
                if (typeRent instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) typeRent;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(typeRent, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(typeRent, Long.valueOf(createRow));
                C4763x6ae73d8c ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface = typeRent;
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, typeRentColumnInfo.nameIndex, createRow, realmGet$name, false);
                }
                String realmGet$displayName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface.realmGet$displayName();
                if (realmGet$displayName != null) {
                    Table.nativeSetString(nativePtr, typeRentColumnInfo.displayNameIndex, createRow, realmGet$displayName, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, TypeRent typeRent, Map<RealmModel, Long> map) {
        if (typeRent instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) typeRent;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TypeRent.class);
        long nativePtr = table.getNativePtr();
        TypeRentColumnInfo typeRentColumnInfo = (TypeRentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TypeRent.class);
        long createRow = OsObject.createRow(table);
        map.put(typeRent, Long.valueOf(createRow));
        C4763x6ae73d8c ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface = typeRent;
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, typeRentColumnInfo.nameIndex, createRow, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, typeRentColumnInfo.nameIndex, createRow, false);
        }
        String realmGet$displayName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface.realmGet$displayName();
        if (realmGet$displayName != null) {
            Table.nativeSetString(nativePtr, typeRentColumnInfo.displayNameIndex, createRow, realmGet$displayName, false);
        } else {
            Table.nativeSetNull(nativePtr, typeRentColumnInfo.displayNameIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(TypeRent.class);
        long nativePtr = table.getNativePtr();
        TypeRentColumnInfo typeRentColumnInfo = (TypeRentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TypeRent.class);
        while (it.hasNext()) {
            TypeRent typeRent = (TypeRent) it.next();
            if (!map2.containsKey(typeRent)) {
                if (typeRent instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) typeRent;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(typeRent, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(typeRent, Long.valueOf(createRow));
                C4763x6ae73d8c ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface = typeRent;
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, typeRentColumnInfo.nameIndex, createRow, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, typeRentColumnInfo.nameIndex, createRow, false);
                }
                String realmGet$displayName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface.realmGet$displayName();
                if (realmGet$displayName != null) {
                    Table.nativeSetString(nativePtr, typeRentColumnInfo.displayNameIndex, createRow, realmGet$displayName, false);
                } else {
                    Table.nativeSetNull(nativePtr, typeRentColumnInfo.displayNameIndex, createRow, false);
                }
            }
        }
    }

    public static TypeRent createDetachedCopy(TypeRent typeRent, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        TypeRent typeRent2;
        if (i > i2 || typeRent == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(typeRent);
        if (cacheData == null) {
            typeRent2 = new TypeRent();
            map.put(typeRent, new RealmObjectProxy.CacheData(i, typeRent2));
        } else if (i >= cacheData.minDepth) {
            return (TypeRent) cacheData.object;
        } else {
            cacheData.minDepth = i;
            typeRent2 = (TypeRent) cacheData.object;
        }
        C4763x6ae73d8c ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface = typeRent2;
        C4763x6ae73d8c ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface2 = typeRent;
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface.realmSet$name(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface.realmSet$displayName(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxyinterface2.realmGet$displayName());
        return typeRent2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("TypeRent = proxy[");
        sb.append("{name:");
        String str = "null";
        sb.append(realmGet$name() != null ? realmGet$name() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{displayName:");
        if (realmGet$displayName() != null) {
            str = realmGet$displayName();
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
        C4762x65e9722d ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxy = (C4762x65e9722d) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_myrenta_typerentrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
